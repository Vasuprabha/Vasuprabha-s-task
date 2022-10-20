package sep_29;

public class inter_example implements inter , inter1 {
	
	@Override
	public void reg_no() {
	
		System.out.println("Reg_no is : 101");
	}
	@Override
	public void name() {
		System.out.println("Name is : Subha");		
	}
	@Override
	public void core_sub() {
		System.out.println("Total core subjects are : 8");	
	}
	@Override
	public void Elective_sub() {
		System.out.println("Total Elective subjects are is : 10");
	}
	
	
public static void main(String[] args) {
	
	inter_example obj=new inter_example();
	obj.reg_no();
	obj.name();
	obj.core_sub();
	obj.Elective_sub();
}
}
