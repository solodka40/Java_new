import Calculator.operations.Div;
import Calculator.operations.Multy;
import org.junit.Assert;
import org.junit.Test;

public class Tests_Task8 {

    @Test
public void CheckingForMulty (){
        Multy multy=new Multy(2,1);
        Assert.assertEquals("Операция умножения работает некорректно",2,multy.action(),0.00000);
    }
    @Test
    public void CheckingForDiv (){
        Div div=new Div(27,9);
        Assert.assertEquals("Деление сломалось!", 3,div.action(),0.00000);

    }
}
