import java.util.List;

class Student {
	String index;
	String firstName;
	String lastName;
    List<Double> lista=new ArrayList<Double>();
	Student(String ind,String ime,String prezime,List<Double> lab) {
		index=ind;
		firstName=ime;
		lastName=prezime;
		lista.addAll(lab);
	}

	String getInd() {
		return index;
	}
	String getIme() {
		return firstName;
	}

	String getPre() {
		return lastName;
	}

	List<Double> getLista() {
		return lista;
	}
	
	void setIme(String ime) {
		firstName=ime;
	}
	void setPre(String pre) {
		lastName=pre;
	}
	void setInd(String ind) {
		index=ind;
	}
	void setLista(List<Double> lab) {
		lista.clear();
		lista.addAll(lab);
	}


	public double getAverage() {
		double br=0;
		double labP=0;
		for(int i=0;i<lista.size();i++) {
			labP+=lista.get(i);
			br++;
		}
		return labP/br;
	}

	public boolean hasSignature() {
		if(lista.size()>8)
			return true;
		else return false;
	}
}
