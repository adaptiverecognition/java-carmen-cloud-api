package com.adaptiverecognition.cloud;

import java.util.ArrayList;
import java.util.List;

import com.adaptiverecognition.cloud.vehicle.AdrPlate;
import com.adaptiverecognition.cloud.vehicle.Data;
import com.adaptiverecognition.cloud.vehicle.EmptyAdrPlate;
import com.adaptiverecognition.cloud.vehicle.LicensePlate;
import com.adaptiverecognition.cloud.vehicle.Plate;
import com.adaptiverecognition.cloud.vehicle.Vehicle;
import com.adaptiverecognition.cloud.vehicle.VehicleResult;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ResponseBuilderTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ResponseBuilderTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ResponseBuilderTest.class);
    }

    /**
     * ResponseBuilder test
     */
    public void testResponseBuilder() {
        LicensePlate lp = new LicensePlate();
        lp.setFound(true);
        lp.setPlateType(100000);
        lp.setUnicodeText("AAA123");
        lp.setCountry("HUN");

        AdrPlate ap = new AdrPlate();
        ap.setPlateType(999980);
        ap.setUnicodeText("112222");

        AdrPlate ap2 = new AdrPlate(Plate.TypeCategory.IMO_ADR_PLATE);
        ap2.setPlateType(999985);
        ap2.setUnicodeText("FLAMMABLE");

        EmptyAdrPlate eap = new EmptyAdrPlate();
        eap.setPlateType(999990);

        Vehicle v = new Vehicle();
        List<Plate> markings = new ArrayList<>();
        v.setMarkings(markings);
        v.setPlate(lp);
        markings.add(ap);
        markings.add(ap2);
        markings.add(eap);

        VehicleResult r = new VehicleResult();
        r.setData(new Data());
        r.getData().setVehicles(new ArrayList<>());
        r.getData().getVehicles().add(v);

        String result = r.toJson();
        System.out.println("Result1: " + r);
        System.out.println("Result1 as json: " + result);
        VehicleResult r2 = r.getResponseBuilder().getJsonConverter().fromJson(result, VehicleResult.class);
        System.out.println("Result2: " + r2);
        assertEquals(r, r2);
    }
}