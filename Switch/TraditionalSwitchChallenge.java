public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        aplhabet('A');
        aplhabet('B');
        aplhabet('C');
        aplhabet('F');
    }
    public static String aplhabet  ( char varaible ){
        switch (varaible) {
            case 'A':
                System.out.println(varaible + ": Able");
                break;
            case 'B':
                System.out.println(varaible + ": Baker");
                break;
            case 'C':
                System.out.println(varaible + ": Charlie");
                break;
            case 'D':
                System.out.println(varaible + ": Dog");
                break;
            case 'E':
                System.out.println(varaible + ": Easy");
                break;
           default:
                System.out.println("Letter was not found "+varaible);
                 break;
        }
        return "";
    }
}
