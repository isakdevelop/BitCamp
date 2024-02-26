package view;

public class PhoneInheritance {
    public static void main(String[] args) {
        System.out.println("-----------------------------집 전화----------------------------");

        Phone phone = new Phone();
        phone.setCompany("금성");
        phone.setCall("제임스");
        System.out.println(phone);

        System.out.println("-----------------------------휴대전화----------------------------");

        CelPhone celPhone = new CelPhone();
        celPhone.setCompany("노키아");
        celPhone.setCall("에릭");
        celPhone.setPortable(true);
        System.out.println(celPhone);

        System.out.println("-----------------------------아이폰-----------------------------");

        IPhone iPhone = new IPhone();
        iPhone.setCompany("애플");
        iPhone.setCall("톰");
        iPhone.setPortable(true);
        iPhone.setData("전송하다");
        System.out.println(iPhone); // 애플 아이폰으로 톰에게 폰을 휴대할 수 있음 전송하다.

        System.out.println("-----------------------------갤럭시-----------------------------");
        AndroidPhone androidPhone = new AndroidPhone();
        androidPhone.setCompany("삼성");
        androidPhone.setSize("13");
        androidPhone.setCall("제인");
        androidPhone.setPortable(true);
        androidPhone.setData("전송하다");
        System.out.println(androidPhone);   // 삼성 갤럭시노트로 제인에게 10인치 폰을 휴대할수 있음 데이터를 전송하다
    }
}

class CelPhone extends Phone  {
    protected boolean portable; //이동성, 휴대가능성
    protected String move;

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        if (portable)   {
            this.setMove("폰을 휴대할 수 있음");
        }  else {
            this.setMove("폰을 휴대할 수 없음");
        }

        this.portable = portable;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return "휴대폰{" +
                "제조사='" + super.company + '\'' +
                ", 수신자='" + super.call + '\'' +
                "이동성=" + portable +
                ", 이동유무='" + move + '\'' +
                '}';
    }
}

class Phone   {
    protected String company, call;   //인스턴수 변수 = 멤버 변수 =>힙 영역
    static final double TAX_RATE = 0.095; // 스태틱 변수 = 전역 변수 <=> 스태틱 영역

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company + "에서 제작하다";
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call + "에게 전화를 걸다";
    }

    @Override
    public String toString() {
        return "집 전화{" +
                "제조사='" + company + '\'' +
                ", 수신자='" + call + '\'' +
                '}';
    }
}

class IPhone extends CelPhone  {
    protected String data;
    public static final String BRAND = "iPhone";

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "IPhone{" + '\n' +
                "제조사='" + company + '\n' +
                BRAND + '\'' + '\n' +
                "수신자='" + call + '\n' +
                "이동성=" + portable +
                "이동유무='" + move + '\n' +
                "데이터='" + data + '\n' +
                '}';
    }
}

class AndroidPhone extends IPhone   {
    public static final String BRAND = "GALAXY NOTE";
    private String size;

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "갤럭시 {" + '\n' +
                "제조사 = " + company + '\n' +
                BRAND + '\n' +
                "수신자 = " + call + '\n' +
                "사이즈 = " + size + '\n' +
                "이동성 = " + portable + '\n' +
                "이동유무 = " + move + '\n' +
                "데이터 = " + data + '\n' +
                '}';
    }
}