package com.nestvision.nest.proxy.schedule;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nestvision.nest.proxy.fhir.entity.AdmissionRecord;
import com.nestvision.nest.proxy.fhir.entity.AdultHealthExamination;
import com.nestvision.nest.proxy.fhir.entity.Appointment;
import com.nestvision.nest.proxy.fhir.entity.Bed;
import com.nestvision.nest.proxy.fhir.entity.BirthCertificate;
import com.nestvision.nest.proxy.fhir.entity.ChargingItem;
import com.nestvision.nest.proxy.fhir.entity.Clinictype;
import com.nestvision.nest.proxy.fhir.entity.DeathProof;
import com.nestvision.nest.proxy.fhir.entity.Department;
import com.nestvision.nest.proxy.fhir.entity.DiagnosisProve;
import com.nestvision.nest.proxy.fhir.entity.DischargeSummary;
import com.nestvision.nest.proxy.fhir.entity.Employee;
import com.nestvision.nest.proxy.fhir.entity.ExamineOrder;
import com.nestvision.nest.proxy.fhir.entity.ExamineReport;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.fhir.entity.HcrDeathRecord;
import com.nestvision.nest.proxy.fhir.entity.Hospital;
import com.nestvision.nest.proxy.fhir.entity.InInjuryExternalCause;
import com.nestvision.nest.proxy.fhir.entity.InhospitalDiagnosis;
import com.nestvision.nest.proxy.fhir.entity.InpatientCharges;
import com.nestvision.nest.proxy.fhir.entity.InpatientRegistration;
import com.nestvision.nest.proxy.fhir.entity.InpatientSymptom;
import com.nestvision.nest.proxy.fhir.entity.InspectOrder;
import com.nestvision.nest.proxy.fhir.entity.InspectReport;
import com.nestvision.nest.proxy.fhir.entity.LongtermAdvice;
import com.nestvision.nest.proxy.fhir.entity.MedicalRecord;
import com.nestvision.nest.proxy.fhir.entity.Medication;
import com.nestvision.nest.proxy.fhir.entity.NeonatalDefectsDiagnosis;
import com.nestvision.nest.proxy.fhir.entity.Operation;
import com.nestvision.nest.proxy.fhir.entity.OperationOrder;
import com.nestvision.nest.proxy.fhir.entity.OuthospitalMajorDiagnosis;
import com.nestvision.nest.proxy.fhir.entity.OuthospitalOtherDiagnosis;
import com.nestvision.nest.proxy.fhir.entity.OutpatientCharges;
import com.nestvision.nest.proxy.fhir.entity.OutpatientDiagnosis;
import com.nestvision.nest.proxy.fhir.entity.OutpatientMedicalRecord;
import com.nestvision.nest.proxy.fhir.entity.OutpatientPrescription;
import com.nestvision.nest.proxy.fhir.entity.OutpatientRegistration;
import com.nestvision.nest.proxy.fhir.entity.OutpatientSymptom;
import com.nestvision.nest.proxy.fhir.entity.PathologicalReport;
import com.nestvision.nest.proxy.fhir.entity.PathologyDiagnosis;
import com.nestvision.nest.proxy.fhir.entity.Patient;
import com.nestvision.nest.proxy.fhir.entity.Schedule;
import com.nestvision.nest.proxy.fhir.entity.Slot;
import com.nestvision.nest.proxy.fhir.entity.TemporaryAdvice;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.SystemType;
import com.nestvision.nest.proxy.fhir.service.AdmissionRecordService;
import com.nestvision.nest.proxy.fhir.service.AdultHealthExaminationService;
import com.nestvision.nest.proxy.fhir.service.AppointmentService;
import com.nestvision.nest.proxy.fhir.service.BedService;
import com.nestvision.nest.proxy.fhir.service.BirthCertificateService;
import com.nestvision.nest.proxy.fhir.service.ChargingItemService;
import com.nestvision.nest.proxy.fhir.service.ClinictypeService;
import com.nestvision.nest.proxy.fhir.service.DeathProofService;
import com.nestvision.nest.proxy.fhir.service.DepartmentService;
import com.nestvision.nest.proxy.fhir.service.DiagnosisProveService;
import com.nestvision.nest.proxy.fhir.service.DischargeSummaryService;
import com.nestvision.nest.proxy.fhir.service.EmployeeService;
import com.nestvision.nest.proxy.fhir.service.ExamineOrderService;
import com.nestvision.nest.proxy.fhir.service.ExamineReportService;
import com.nestvision.nest.proxy.fhir.service.HcrDeathRecordService;
import com.nestvision.nest.proxy.fhir.service.HospitalService;
import com.nestvision.nest.proxy.fhir.service.InInjuryExternalCauseService;
import com.nestvision.nest.proxy.fhir.service.InhospitalDiagnosisService;
import com.nestvision.nest.proxy.fhir.service.InpatientChargesService;
import com.nestvision.nest.proxy.fhir.service.InpatientRegistrationService;
import com.nestvision.nest.proxy.fhir.service.InpatientSymptomService;
import com.nestvision.nest.proxy.fhir.service.InspectOrderService;
import com.nestvision.nest.proxy.fhir.service.InspectReportService;
import com.nestvision.nest.proxy.fhir.service.LongtermAdviceService;
import com.nestvision.nest.proxy.fhir.service.MedicalRecordService;
import com.nestvision.nest.proxy.fhir.service.MedicationService;
import com.nestvision.nest.proxy.fhir.service.NeonatalDefectsDiagnosisService;
import com.nestvision.nest.proxy.fhir.service.OperationOrderService;
import com.nestvision.nest.proxy.fhir.service.OperationService;
import com.nestvision.nest.proxy.fhir.service.OuthospitalMajorDiagnosisService;
import com.nestvision.nest.proxy.fhir.service.OuthospitalOtherDiagnosisService;
import com.nestvision.nest.proxy.fhir.service.OutpatientChargesService;
import com.nestvision.nest.proxy.fhir.service.OutpatientDiagnosisService;
import com.nestvision.nest.proxy.fhir.service.OutpatientMedicalRecordService;
import com.nestvision.nest.proxy.fhir.service.OutpatientPrescriptionService;
import com.nestvision.nest.proxy.fhir.service.OutpatientRegistrationService;
import com.nestvision.nest.proxy.fhir.service.OutpatientSymptomService;
import com.nestvision.nest.proxy.fhir.service.PathologicalReportService;
import com.nestvision.nest.proxy.fhir.service.PathologyDiagnosisService;
import com.nestvision.nest.proxy.fhir.service.PatientService;
import com.nestvision.nest.proxy.fhir.service.ScheduleService;
import com.nestvision.nest.proxy.fhir.service.SlotService;
import com.nestvision.nest.proxy.fhir.service.TemporaryAdviceService;
import com.nestvision.nest.proxy.test.EntityGenarator;
import com.nestvision.nest.proxy.test.TestConstants;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestDataGenarate {
	
	private int fullEntityNumbers = 1000;

    private int nessarayEntityNumbers = 1000;
    
    
	@Autowired
    private AdmissionRecordService admissionRecordService;
	
	@Autowired
    private AdultHealthExaminationService adultHealthExaminationService; 
	
	@Autowired
	private AppointmentService appointmentService; 
	
	@Autowired
    private BedService bedService;
	@Autowired
    private BirthCertificateService birthCertificateService;  
	
	@Autowired
    private ChargingItemService chargingItemService;
	
	@Autowired
    private ClinictypeService clinictypeService; 
	
	@Autowired
    private DeathProofService deathProofService;
	
	@Autowired
    private DepartmentService departmentService;
	
	@Autowired
    private DiagnosisProveService diagnosisProveService;
	
	@Autowired
    private DischargeSummaryService dischargeSummaryService;
	
	@Autowired
    private EmployeeService employeeService;
	
	@Autowired
    private ExamineOrderService examineOrderService;
	
	@Autowired
    private ExamineReportService examineReportService;
	
	@Autowired
    private HcrDeathRecordService hcrDeathRecordService;
	
	@Autowired
    private HospitalService hospitalService;
	
	@Autowired
    private InhospitalDiagnosisService inhospitalDiagnosisService;
	
	@Autowired
    private InInjuryExternalCauseService inInjuryExternalCauseService;
	
	@Autowired
    private InpatientChargesService inpatientChargesService;
	
	@Autowired
    private InpatientRegistrationService inpatientRegistrationService;
	
	@Autowired
    private InpatientSymptomService inpatientSymptomService;
	
	@Autowired
    private InspectOrderService inspectOrderService;
	
	@Autowired
    private InspectReportService inspectReportService;
	
	@Autowired
    private LongtermAdviceService longtermAdviceService;
	
	@Autowired
    private MedicalRecordService medicalRecordService; 
	
	@Autowired
    private MedicationService medicationService;
	
	@Autowired
    private NeonatalDefectsDiagnosisService neonatalDefectsDiagnosisService;   
	
	@Autowired
    private OperationService operationService;
	
	@Autowired
    private OperationOrderService operationOrderService;
	
	@Autowired
    private OuthospitalMajorDiagnosisService outhospitalMajorDiagnosisService;
	
	@Autowired
    private OuthospitalOtherDiagnosisService outhospitalOtherDiagnosisService;
	
	@Autowired
    private OutpatientChargesService outpatientChargesService;   
	
	@Autowired
    private OutpatientDiagnosisService outpatientDiagnosisService;
	
	@Autowired
    private OutpatientMedicalRecordService outpatientMedicalRecordService;
	
	@Autowired
    private OutpatientPrescriptionService outpatientPrescriptionService;
	
	@Autowired
    private OutpatientRegistrationService outpatientRegistrationService;
	
	@Autowired
    private OutpatientSymptomService outpatientSymptomService;
	
	@Autowired
    private PathologicalReportService pathologicalReportService; 
	
	@Autowired
    private PathologyDiagnosisService pathologyDiagnosisService;
	
	@Autowired
    private PatientService patientService;
	
	@Autowired
    private ScheduleService scheduleService;
	
	@Autowired
    private SlotService slotService;
	
	@Autowired
    private TemporaryAdviceService temporaryAdviceService;
	
	
	@Test
	public void test() throws Exception{
		for(int i = 0; i < 10; i++){
			log.info("AdmissionRecord start");
			List<AdmissionRecord> nessaryEntities = genarateNessarayEntities(AdmissionRecord.class);
			admissionRecordService.saveAll(nessaryEntities);
			log.info("AdmissionRecord end...");
			log.info("2");
			List<AdultHealthExamination> nessaryEntities1 = genarateNessarayEntities(AdultHealthExamination.class);
			adultHealthExaminationService.saveAll(nessaryEntities1);
			log.info("3");
			List<Appointment> nessaryEntities2 = genarateNessarayEntities(Appointment.class);
			appointmentService.saveAll(nessaryEntities2);
			log.info("4");
			List<Bed> nessaryEntities4 = genarateNessarayEntities(Bed.class);
			bedService.saveAll(nessaryEntities4);
			log.info("5");
			List<BirthCertificate> nessaryEntities5 = genarateNessarayEntities(BirthCertificate.class);
			birthCertificateService.saveAll(nessaryEntities5);
			log.info("6");
			List<ChargingItem> nessaryEntities6 = genarateNessarayEntities(ChargingItem.class);
			chargingItemService.saveAll(nessaryEntities6);
			log.info("7");
			List<Clinictype> nessaryEntities7 = genarateNessarayEntities(Clinictype.class);
			clinictypeService.saveAll(nessaryEntities7);
			log.info("8");
			List<DeathProof> nessaryEntities8 = genarateNessarayEntities(DeathProof.class);
			deathProofService.saveAll(nessaryEntities8);
			log.info("9");
			List<Department> nessaryEntities9 = genarateNessarayEntities(Department.class);
			departmentService.saveAll(nessaryEntities9);
			log.info("10");
			List<DiagnosisProve> nessaryEntities10 = genarateNessarayEntities(DiagnosisProve.class);
			diagnosisProveService.saveAll(nessaryEntities10);
			log.info("11");
			List<DischargeSummary> nessaryEntities11 = genarateNessarayEntities(DischargeSummary.class);
			dischargeSummaryService.saveAll(nessaryEntities11);
			log.info("12");
			List<Employee> nessaryEntities12 = genarateNessarayEntities(Employee.class);
			employeeService.saveAll(nessaryEntities12);
			log.info("13");
			List<ExamineOrder> nessaryEntities13 = genarateNessarayEntities(ExamineOrder.class);
			examineOrderService.saveAll(nessaryEntities13);
			log.info("14");
			List<ExamineReport> nessaryEntities14 = genarateNessarayEntities(ExamineReport.class);
			examineReportService.saveAll(nessaryEntities14);
			log.info("15");
			List<HcrDeathRecord> nessaryEntities15 = genarateNessarayEntities(HcrDeathRecord.class);
			hcrDeathRecordService.saveAll(nessaryEntities15);
			log.info("16");
			List<Hospital> nessaryEntities16 = genarateNessarayEntities(Hospital.class);
			hospitalService.saveAll(nessaryEntities16);
			log.info("17");
			List<InhospitalDiagnosis> nessaryEntities17 = genarateNessarayEntities(InhospitalDiagnosis.class);
			inhospitalDiagnosisService.saveAll(nessaryEntities17);
			log.info("18");
			List<InInjuryExternalCause> nessaryEntities18 = genarateNessarayEntities(InInjuryExternalCause.class);
			inInjuryExternalCauseService.saveAll(nessaryEntities18);
			log.info("19");
			List<InpatientCharges> nessaryEntities19 = genarateNessarayEntities(InpatientCharges.class);
			inpatientChargesService.saveAll(nessaryEntities19);
			log.info("20");
			List<InpatientRegistration> nessaryEntities20 = genarateNessarayEntities(InpatientRegistration.class);
			inpatientRegistrationService.saveAll(nessaryEntities20);
			log.info("21");
			List<InpatientSymptom> nessaryEntities21 = genarateNessarayEntities(InpatientSymptom.class);
			inpatientSymptomService.saveAll(nessaryEntities21);
			log.info("22");
			List<InspectOrder> nessaryEntities22 = genarateNessarayEntities(InspectOrder.class);
			inspectOrderService.saveAll(nessaryEntities22);
			log.info("23");
			List<InspectReport> nessaryEntities23 = genarateNessarayEntities(InspectReport.class);
			inspectReportService.saveAll(nessaryEntities23);
			log.info("24");
			List<LongtermAdvice> nessaryEntities24 = genarateNessarayEntities(LongtermAdvice.class);
			longtermAdviceService.saveAll(nessaryEntities24);
			log.info("25");
			List<MedicalRecord> nessaryEntities25 = genarateNessarayEntities(MedicalRecord.class);
			medicalRecordService.saveAll(nessaryEntities25);
			log.info("26");
			List<Medication> nessaryEntities26 = genarateNessarayEntities(Medication.class);
			medicationService.saveAll(nessaryEntities26);
			log.info("27");
			List<NeonatalDefectsDiagnosis> nessaryEntities27 = genarateNessarayEntities(NeonatalDefectsDiagnosis.class);
			neonatalDefectsDiagnosisService.saveAll(nessaryEntities27);
			log.info("28");
			List<Operation> nessaryEntities28 = genarateNessarayEntities(Operation.class);
			operationService.saveAll(nessaryEntities28);
			log.info("29");
			List<OperationOrder> nessaryEntities29 = genarateNessarayEntities(OperationOrder.class);
			operationOrderService.saveAll(nessaryEntities29);
			log.info("30");
			List<OuthospitalMajorDiagnosis> nessaryEntities30 = genarateNessarayEntities(OuthospitalMajorDiagnosis.class);
			outhospitalMajorDiagnosisService.saveAll(nessaryEntities30);
			log.info("31");
			List<OuthospitalOtherDiagnosis> nessaryEntities31 = genarateNessarayEntities(OuthospitalOtherDiagnosis.class);
			outhospitalOtherDiagnosisService.saveAll(nessaryEntities31);
			log.info("32");
			List<OutpatientCharges> nessaryEntities32 = genarateNessarayEntities(OutpatientCharges.class);
			outpatientChargesService.saveAll(nessaryEntities32);
			log.info("33");
			List<OutpatientDiagnosis> nessaryEntities33 = genarateNessarayEntities(OutpatientDiagnosis.class);
			outpatientDiagnosisService.saveAll(nessaryEntities33);
			log.info("34");
			List<OutpatientMedicalRecord> nessaryEntities34 = genarateNessarayEntities(OutpatientMedicalRecord.class);
			outpatientMedicalRecordService.saveAll(nessaryEntities34);
			log.info("35");
			List<OutpatientPrescription> nessaryEntities35 = genarateNessarayEntities(OutpatientPrescription.class);
			outpatientPrescriptionService.saveAll(nessaryEntities35);
			log.info("36");
			List<OutpatientRegistration> nessaryEntities36 = genarateNessarayEntities(OutpatientRegistration.class);
			outpatientRegistrationService.saveAll(nessaryEntities36);
			log.info("37");
			List<OutpatientSymptom> nessaryEntities37 = genarateNessarayEntities(OutpatientSymptom.class);
			outpatientSymptomService.saveAll(nessaryEntities37);
			log.info("38");
			List<PathologicalReport> nessaryEntities38 = genarateNessarayEntities(PathologicalReport.class);
			pathologicalReportService.saveAll(nessaryEntities38);
			log.info("39");
			List<PathologyDiagnosis> nessaryEntities39 = genarateNessarayEntities(PathologyDiagnosis.class);
			pathologyDiagnosisService.saveAll(nessaryEntities39);
			/*log.info("40");
			List<Patient> nessaryEntities40 = genarateNessarayEntities(Patient.class);
			patientService.saveAll(nessaryEntities40);*/
			/*log.info("41");
			List<Schedule> nessaryEntities41 = genarateNessarayEntities(Schedule.class);
			scheduleService.saveAll(nessaryEntities41);
			log.info("42");
			List<Slot> nessaryEntities42 = genarateNessarayEntities(Slot.class);
			slotService.saveAll(nessaryEntities42);
			log.info("43");*/
			List<TemporaryAdvice> nessaryEntities43 = genarateNessarayEntities(TemporaryAdvice.class);
			temporaryAdviceService.saveAll(nessaryEntities43);
		}
	}
	
	
	
	protected void setCommonProperties(FhirResourceEntity fhirResourceEntity) {

        fhirResourceEntity.setUid(UUID.randomUUID().toString());
        fhirResourceEntity.setDealState(DealState.UNPROCESSED);
        fhirResourceEntity.setDeveloper("sinosoft");
        fhirResourceEntity.setOperationState(OperationState.CREATE);
        fhirResourceEntity.setUpHospital(TestConstants.HOSPITAL_ID);
        fhirResourceEntity.setDeveloperSystemType(SystemType.his);
    }

    public <T extends FhirResourceEntity> T genarate(Class<T> clazz, boolean full) throws Exception {
        T fhirResourceEntity = null;
        if (full) {
            fhirResourceEntity = EntityGenarator.genarate(clazz);
        } else {
            fhirResourceEntity = EntityGenarator.genarateNessaray(clazz);
        }
        setCommonProperties(fhirResourceEntity);
        return fhirResourceEntity;
    }

    public <T extends FhirResourceEntity> List<T> genarateFullEntities(Class<T> clazz) throws Exception {

        List<T> fullEntities = new ArrayList<>();
        for (int i = 0; i < fullEntityNumbers; i++) {
            fullEntities.add(genarate(clazz, true));
        }
        return fullEntities;

    }

    public <T extends FhirResourceEntity> List<T> genarateNessarayEntities(Class<T> clazz) throws Exception {

        List<T> fullEntities = new ArrayList<>();
        for (int i = 0; i < nessarayEntityNumbers; i++) {
            fullEntities.add(genarate(clazz, false));
        }
        return fullEntities;

    }


    public void setFullEntityNumbers(int fullEntityNumbers) {
        this.fullEntityNumbers = fullEntityNumbers;
    }

    public int getFullEntityNumbers() {
        return fullEntityNumbers;
    }

    public int getNessarayEntityNumbers() {
        return nessarayEntityNumbers;
    }

    public void setNessarayEntityNumbers(int nessarayEntityNumbers) {
        this.nessarayEntityNumbers = nessarayEntityNumbers;
    }
}
