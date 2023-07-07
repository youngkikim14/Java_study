package Exception;

public class ExceptionStudy {


    class OurBadException extends Exception {
        public OurBadException() {
            super("위험한 행동을 하면 예외처리를 꼭 해야합니다!");
        }
    }

    class OurClass {
        private final Boolean just = true;

        // 신규 문법 throws!
        public void thisMethodIsDangerous() throws OurBadException {
            if (just) {
                // 신규 문법 throw!
                String a = "예외 처리함";
                System.out.println(a);
            }
        }
    }


    public static void main(String[] args) {

    }

}


