import java.util.List;

public class PersonnelFactory {


    public static Person createPersonnel(int type, Object[]parameters){
        switch(type)
        {
            case 0:
                return new Person((String)parameters[0], (String)parameters[1],(String)parameters[2]);
            case 1:
                return  new Employee((String)parameters[0], (String)parameters[1],(String)parameters[2], (int)parameters[3], (double)parameters[4]);
            //break;

            //More categories of personnel could be added here.

            default:
                return null;

        }

    }
}
