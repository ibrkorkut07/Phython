package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import pojos.OgrenciOlusturmaPojo;
import utilities.BaseURL;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StudentManagementStepDefinition extends BaseURL {

    OgrenciOlusturmaPojo expectedData;
    JsonPath actualData;

    @Given("Ogrenci olusturmak icin endpoint hazirlanir US15")
    public void ogrenci_olusturmak_icin_endpoint_hazirlanir_US15() {
        spec.pathParams("first", "students", "second", "save");
    }

    @And("Body olarak gonderilecek data hazirlanir US15")
    public void bodyOlarakGonderilecekDataHazirlanirUS15() {
        expectedData = new OgrenciOlusturmaPojo(250,
                "1980-01-01",
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createName()+"@gmail.com",
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak gonderilecek data advisorTeacherId bilgisine yer verilmeden hazirlanir US15")
    public void bodyOlarakGonderilecekDataAdvisorTeacherIdBilgisineYerVerilmedenHazirlanirUS15() {
        expectedData = new OgrenciOlusturmaPojo(null,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak gonderilecek data name bilgisine yer verilmeden hazirlanir US15")
    public void bodyOlarakGonderilecekDataNameBilgisineYerVerilmedenHazirlanirUS15() {
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                null,
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak gonderilecek data surname bilgisine yer verilmeden hazirlanir US15")
    public void bodyOlarakGonderilecekDataSurnameBilgisineYerVerilmedenHazirlanirUS15() {
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                null,
                ReusableMethods.createUserName());
    }

    @And("Body olarak gonderilecek data birthPlace bilgisine yer verilmeden hazirlanir US15")
    public void bodyOlarakGonderilecekDataBirthPlaceBilgisineYerVerilmedenHazirlanirUS15() {
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                null,
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak gonderilecek data email bilgisine yer verilmeden hazirlanir US15")
    public void bodyOlarakGonderilecekDataEmailBilgisineYerVerilmedenHazirlanirUS15() {
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                null,
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak gonderilecek data phoneNumber bilgisine yer verilmeden hazirlanir US15")
    public void bodyOlarakGonderilecekDataPhoneNumberBilgisineYerVerilmedenHazirlanirUS15() {
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                null,
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak gonderilecek data gender bilgisine yer verilmeden hazirlanir US15")
    public void bodyOlarakGonderilecekDataGenderBilgisineYerVerilmedenHazirlanirUS15() {
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                null,
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak gonderilecek data birthDay bilgisine yer verilmeden hazirlanir US15")
    public void bodyOlarakGonderilecekDataBirthDayBilgisineYerVerilmedenHazirlanirUS15() {
        expectedData = new OgrenciOlusturmaPojo(221,
                null,
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak gonderilecek data ssn bilgisine yer verilmeden hazirlanir US15")
    public void bodyOlarakGonderilecekDataSsnBilgisineYerVerilmedenHazirlanirUS15() {
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                null,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak ssn bilgisinde ucuncu rakamdan sonra tire icermeyecek sekilde data gonderilir US15")
    public void bodyOlarakSsnBilgisindeUcuncuRakamdanSonraTireIcermeyecekSekildeDataGonderilirUS15() {
        String ssn = (ReusableMethods.createSSN().substring(0, 3)) + "8" + (ReusableMethods.createSSN().substring(4));
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssn,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak ssn bilgisinde besinci rakamdan sonra tire icermeyecek sekilde data gonderilir US15")
    public void bodyOlarakSsnBilgisindeBesinciRakamdanSonraTireIcermeyecekSekildeDataGonderilirUS15() {
        String ssn = (ReusableMethods.createSSN().substring(0, 6)) + "8" + (ReusableMethods.createSSN().substring(7));
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssn,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak ssn bilgisinde sekiz rakam icerecek sekilde data gonderilir US15")
    public void bodyOlarakSsnBilgisindeSekizRakamIcerecekSekildeDataGonderilirUS15() {
        String ssn = (ReusableMethods.createSSN().substring(0, 8)) + (ReusableMethods.createSSN().substring(9));
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssn,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak ssn bilgisinde on rakam icerecek sekilde data gonderilir US15")
    public void bodyOlarakSsnBilgisindeOnRakamIcerecekSekildeDataGonderilirUS15() {
        String ssn = (ReusableMethods.createSSN().substring(0, 9)) + "8" + (ReusableMethods.createSSN().substring(9));
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssn,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak gonderilecek data username bilgisine yer verilmeden hazirlanir US15")
    public void bodyOlarakGonderilecekDataUsernameBilgisineYerVerilmedenHazirlanirUS15() {
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                null);
    }

    @And("Body olarak gonderilecek data fatherName bilgisine yer verilmeden hazirlanir US15")
    public void bodyOlarakGonderilecekDataFatherNameBilgisineYerVerilmedenHazirlanirUS15() {
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                null,
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak gonderilecek data motherName bilgisine yer verilmeden hazirlanir US15")
    public void bodyOlarakGonderilecekDataMotherNameBilgisineYerVerilmedenHazirlanirUS15() {
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                null,
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak gonderilecek data password bilgisine yer verilmeden hazirlanir US15")
    public void bodyOlarakGonderilecekDataPasswordBilgisineYerVerilmedenHazirlanirUS15() {
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                null,
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Body olarak password bilgisinde yedi karakter icerecek sekilde data gonderilir US15")
    public void bodyOlarakPasswordBilgisindeYediKarakterIcerecekSekildeDataGonderilirUS15() {
        expectedData = new OgrenciOlusturmaPojo(221,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                null,
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @When("Post request gonderilir US15")
    public void post_request_gonderilir_US15() {
        response = given().spec(spec).when().body(expectedData).post("/{first}/{second}");
        actualData = response.jsonPath();
    }

    @Then("Ogrencinin data'daki bilgilerle olusturuldugu dogrulanir US15")
    public void ogrencinin_datadaki_bilgilerle_olusturuldugu_dogrulanir_US15() {
        assertEquals(expectedData.getBirthDay(), actualData.getString("object.birthDay"));
        assertEquals(expectedData.getEmail(), actualData.getString("object.email"));
        assertEquals(expectedData.getFatherName(), actualData.getString("object.fatherName"));
        assertEquals(expectedData.getGender(), actualData.getString("object.gender"));
        assertEquals(expectedData.getMotherName(), actualData.getString("object.motherName"));
        assertEquals(expectedData.getName(), actualData.getString("object.name"));
        assertEquals(expectedData.getPhoneNumber(), actualData.getString("object.phoneNumber"));
        assertEquals(expectedData.getSurname(), actualData.getString("object.surname"));
        assertEquals(expectedData.getUsername(), actualData.getString("object.username"));
    }

    @Then("Ogrenciye otomatik olarak student number verildigi dogrulanir US15")
    public void ogrenciye_otomatik_olarak_student_number_verildigi_dogrulanir_US15() {
        assertTrue(actualData.getString("object.studentNumber").length() > 0);
    }

}
