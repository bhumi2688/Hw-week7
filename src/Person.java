
//16. Person
public class Person {   //class name
    String firstName ;
    String lastName ;
    int age ;


    public static void main(String[] args) {   //main method
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }
        public String getFirstName()    //instance method with return
        {
            return firstName;
        }
        public String getLastName ()   //instance method with reutn
        {
            return lastName;
        }
        public int getAge ()   //instance method with return
        {
            return age;
        }
        public void setFirstName(String firstName)  //with parameter
        {
            this.firstName = firstName;    //used constructor
        }
        public void setLastName (String lastName)    //with parameter
        {
            this.lastName = lastName;   //used constructor
        }
        public void setAge ( int age){        //used if else
            if (age > 0 && age <= 100) {
                this.age = age;
            } else {
                this.age = 0;
            }
        }
        public boolean isTeen () {     //used boolean

            if (age > 12 && age < 20) {
                return true;
            }else {
                return false;
            }
        }

        public String getFullName () {   //without parameter with return
            if (firstName.isEmpty()) {
                return lastName;
            }
            if (lastName.isEmpty()) {
                return firstName;
            }
            if (firstName.isEmpty() && lastName.isEmpty()) {
                return "";
            } else {
                return firstName + " " + lastName;
            }
        }


    }









