public class GradeBook
{
   private String ProfName;
   private String CourseName;

   public GradeBook( String name, String cname )
   {
      ProfName = name;
      CourseName = cname;
   }

   public String getProfName()
   {
      return ProfName;
   }
   public String getCourseName()
   {
      return CourseName;
   }
   public void displayMessage()
   {

      System.out.printf( "\nWelcome to the grade book for\n%s!\n", getCourseName() );
      System.out.printf( "This course is presented by: %s!\n", 
         getProfName() );
   }
}