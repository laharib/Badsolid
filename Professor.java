interface Faculty{
        public void printProfDetails();
        public void teachSubject();
        public void creditsalary();
        public void facultyduties();
}
public class Professor implements Faculty{
        String Professor_id;
        String Professor_name;
        String[] subjects;

        public void printProfDetails(){ }
        public void teachSubject(){ }
        public void creditsalary(){}
        public void facultyduties(){}

        private int profsalary, Associateprofsalary, Labinchargesalary;

        public void setProfsalary(){}
        public int getProfsalary(){
                return 0;
        }

        public void setAssociteprofsalary(){}
        public int getAssociteprofsalary(){
                return 0;
        }

        public void setLabinchargesalary(){}
        public int getLabinchargesalary(){
                return 0;
        }

}