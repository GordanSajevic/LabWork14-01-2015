
public class CSVBuilderCLass {
	
	private Student student;
	private String res;
	
	public CSVBuilderCLass(Student student)
	{
		this.student = student;
	}
	
	public CSVBuilderCLass append (String res)
	{
		if (res != null)
		{
			res += "," + res;
		}
		else
		{
			res = null;
		}
		return this;
	}

	public String toString()
	{
		if (res != null)
		{
			return res;
		}
		else
		{
			return " ";
		}
	}
	
	public String toCSV()
	{	
		CSVBuilderCLass csv = new CSVBuilderCLass(student);
		csv.append(student.getName()).append(String.valueOf(student.getAddress())).append(String.valueOf(student.getId()));
		return csv.toString();
		
	}
	
}
