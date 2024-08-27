public class Execute {
    public static void main(String[] args) {
        try {
            ExecuteSystem.runExecute();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}