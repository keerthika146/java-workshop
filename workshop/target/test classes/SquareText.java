package workshop.target.Test;

public class SquareText {
            @Test 
            public void testSquare(){
                Square square=(int x) -> x*x;
                Assertion.assertEquals(36, square.findSquare(6));
            } 

}
