import java.util.List;

class Course{
	List<Student> studenti=new ArrayList<Student>(); 
	Course(List<Student> lista){
		studenti.addAll(lista);
	}
	bool checkPotpis(Student stud) {
		if(studenti.contains(stud) && stud.size()>8)
			return true;
		return false;
	}
	
}