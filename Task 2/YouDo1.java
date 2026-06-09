
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ContestStats {
    int[] scores ={85,90,95};
    
    void printFirstScore(){
        System.out.println("First Score: "+scores[0]);
    }
}

public class Main {
    public static void main(String[] args){
        ContestStats contest = new ContestStats();
        contest.printFirstScore();
    }
}
