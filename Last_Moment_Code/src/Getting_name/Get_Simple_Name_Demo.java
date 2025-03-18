package Getting_name;
import java.util.ArrayList;
class Student{
	String name;
	class sabrina{
		
	}	
}
public class Get_Simple_Name_Demo {

	public static void main(String[] args) {
	Student obj=new Student();
	Class<?> cl=Student.class;
	Student[] arr=new Student[3];
	String[][] name=new String[2][3];
	   System.out.println(obj.getClass().getSimpleName());//this will only return the class name
	   System.out.println(obj.getClass().getName());//will return package.class name
	   System.out.println(arr.getClass().getSimpleName());//will return Student[]
	   System.out.println(int.class.getSimpleName());
	   System.out.println(float.class.getSimpleName());
	   System.out.println(boolean.class.getSimpleName());
	   System.out.println(name.getClass().getSimpleName());
	   //primitive
	   System.out.println(int.class.getTypeName());//will be int
	   System.out.println(int.class.getCanonicalName());//will be int
	   System.out.println(int.class.getName());//will be int , for primitive it's int
	   //object 
	   System.out.println(cl.getName());//here with package.nameofclass
	   System.out.println(cl.getTypeName());//same
	   System.out.println(cl.getCanonicalName());//same
	   //inner class
	   Class<?> innerclasss=Student.sabrina.class;
	   System.out.println(innerclasss.getName());//packageName.classname
	   System.out.println(innerclasss.getTypeName());//packageName$classname
	   System.out.println(innerclasss.getCanonicalName());//packagename.class name
	   
	   //Anonymous inner class
	   Student Fano=new Student() {};
	   System.out.println(Fano.getClass().getName());//packageName.Main_class$1
	   System.out.println(Fano.getClass().getTypeName());//packageName.Main_class$1
	   System.out.println(Fano.getClass().getCanonicalName());//null
	   
	  //array
	   System.out.println(Student.sabrina[][].class.getTypeName());//getting_name.Student$sabrina[][]
	   System.out.println(Student.sabrina[][].class.getName());//[[LGetting_name.Student$sabrina;
	   System.out.println(Student.sabrina[][].class.getCanonicalName());//Getting_name.Student.sabrina[][]

	   //ArrayList
	   Class n=ArrayList.class;
	   System.out.println(n.getName());
	   
	   //name of thread
	   Class t=Thread.class;
	   System.out.println(t.getName());
	   
	}
}
