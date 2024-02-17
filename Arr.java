public class Arr {
    String[] args = new String[3];

    public static void main(String[] args) {
        
        int randNum;
        //if (args.length < 3){
           // System.out.println("Error");
            //System.exit(1);
        }try

    {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int count = Integer.parseInt(args[2]);
    }catch(
    NumberFormatException nfe)
    {
        System.out.println("Exception" + nfe.getMessage());
        System.exit(1);
    }for(
    int i = 0;i<count;i++)
    {
        int randNum = min + (int) (Math.random*);
    }

}
