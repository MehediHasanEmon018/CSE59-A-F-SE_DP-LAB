
public class Main3 {

    static class Patient {
        private String patientName;
        private String nationalId;

        public Patient(String patientName, String nationalId) {
            this.patientName = patientName;
            this.nationalId = nationalId;
        }

        public String getPatientName() {
            return patientName;
        }

        public String getNationalId() {
            return nationalId;
        }
    }

    static class IdValidator {
        public boolean validate(String nationalId) {
            return nationalId.length() == 10 || nationalId.length() == 17;
        }
    }

    static class SmsService {
        public void sendConfirmation(Patient patient, IdValidator validator) {
            if (validator.validate(patient.getNationalId())) {
                System.out.println("Sending SMS to " + patient.getPatientName() + ": Registration successful.");
            } else {
                System.out.println("Invalid National ID.");
            }
        }
    }

    interface OptimizableModel {
        void quantize();
    }

    static class ResNet18 implements OptimizableModel {
        @Override
        public void quantize() {
            System.out.println("Applying int8 quantization for ResNet-18.");
        }
    }

    static class MobileNet implements OptimizableModel {
        @Override
        public void quantize() {
            System.out.println("Applying dynamic quantization for MobileNet.");
        }
    }

    static class InferenceEngine {
        public void optimizeModel(OptimizableModel model) {
            model.quantize();
        }
    }

    static class UniversityMember {
        public void attendLecture() {
            System.out.println("Attending a lecture.");
        }
    }

    interface Researcher {
        void conductLabResearch();
    }

    static class UndergraduateStudent extends UniversityMember {
    }

    static class GraduateResearchAssistant extends UniversityMember implements Researcher {
        @Override
        public void conductLabResearch() {
            System.out.println("Publishing papers and running experiments.");
        }
    }

    static class Professor extends UniversityMember implements Researcher {
        @Override
        public void conductLabResearch() {
            System.out.println("Publishing papers and running experiments.");
        }
    }

    public static void main(String[] args) {
        Patient patient = new Patient("Hasan", "1234567890");
        IdValidator validator = new IdValidator();
        SmsService smsService = new SmsService();
        smsService.sendConfirmation(patient, validator);

        InferenceEngine engine = new InferenceEngine();
        engine.optimizeModel(new ResNet18());
        engine.optimizeModel(new MobileNet());

        UniversityMember student = new UndergraduateStudent();
        student.attendLecture();

        Researcher gra = new GraduateResearchAssistant();
        gra.conductLabResearch();

        Researcher professor = new Professor();
        professor.conductLabResearch();
    }
}
