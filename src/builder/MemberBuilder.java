    package builder;

    import model.MemberDTO;

    public class MemberBuilder {
        private double height;
        private double weight;
        private String userName;
        private String password;
        private String confirmPassword;
        private String name;
        private String socialSecurityNumber;
        private String tell;
        private String address;
        private String job;

        public MemberBuilder userName(String userName)  {
            this.userName = userName;
            return this;
        }

        public MemberBuilder password(String password)  {
            this.password = password;
            return this;
        }

        public MemberBuilder confirmPassword(String confirmPassword)    {
            this.confirmPassword = confirmPassword;
            return this;
        }

        public MemberBuilder name(String name)  {
            this.name = name;
            return this;
        }

        public MemberBuilder socialSecurityNumber(String socialSecurityNumber) {
            this.socialSecurityNumber = socialSecurityNumber;
            return this;
        }

        public MemberBuilder tell(String tell)  {
            this.tell = tell;
            return this;
        }

        public MemberBuilder address(String address)    {
            this.address = address;
            return this;
        }

        public MemberBuilder job(String job)    {
            this.job = job;
            return this;
        }

        public MemberBuilder height(double height)  {
            this.height = height;
            return this;
        }

        public MemberBuilder weight(double weight)  {
            this.weight = weight;
            return this;
        }

        public MemberDTO build()    {
            return new MemberDTO(
                    height,
                    weight,
                    userName,
                    password,
                    confirmPassword,
                    name,
                    socialSecurityNumber,
                    tell,
                    address,
                    job
            );
        }
    }
