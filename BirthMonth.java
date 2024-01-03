import java.util.*; 
public class BirthMonth {
    
    public static void main(String[] args) {
        
        int num1 = 0, num2 = 0;
        HashSet group1 = new HashSet();
        HashSet group2 = new HashSet(); 
        HashSet self = new HashSet(); 
        
        Scanner scan = new Scanner(System.in);
        
        for(int a = 0; a <= 6; a++){
            if(a > 0 && a <= 3){
                num1++;
                System.out.print("Enter birth month "+num1+": ");
                String month1 = scan.next(); 
                group1.add(month1);
            }else if(a > 3 && a <= 6){
                num2++;
                System.out.print("Enter birth month "+num2+": "); 
                String month2 = scan.next();
                group2.add(month2);
            }
        }
        HashSet union = new HashSet(group1); 
        HashSet inter = new HashSet(group1); 
        HashSet diff = new HashSet(group1);
        
        union.addAll(group2); 
        union.retainAll(group2);
        diff.removeAll(group2);
        
        System.out.println("Group 1: "+group1); 
        System.out.println("Group 2: "+group2);
        
        System.out.print("Enter your birth month: ");
        String mine = scan.next();
        self.add(mine);
        
        System.out.println("Union: "+union); 
        System.out.println("Intersection: "+inter); 
        System.out.println("Difference: "+diff);
        
        if(group1.containsAll(self)|| group2.containsAll(self)){
            System.out.println("You have the same birth month with atleast one of your classmates.");
        }else{
            System.out.println("You don't have the same birth month with one of your classmates."); 
        }
   
    }
}