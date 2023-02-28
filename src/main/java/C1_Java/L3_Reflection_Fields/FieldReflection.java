package C1_Java.L3_Reflection_Fields;

import java.lang.reflect.Field;

public class FieldReflection {

    public int field1;
    public int field2;

    /**
     * TODO: Use reflection to retrieve the fields of this class!
     * https://www.oracle.com/technical-resources/articles/java/javareflection.html
     * @return an array of Fields containing field1 and field2.
     * This is how an ORM gets information about its entities.
     */
    public Field[] getMyFields(){
        return null;
    }
}
