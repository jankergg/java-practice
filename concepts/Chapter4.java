package concepts;

import java.io.IOException;
import java.net.URISyntaxException;

import static java.lang.System.out;

enum Size{
    SMALL,
    MIDIUM,
    LARGE
}

//4.7501185179240894E8
//4.7501185179240894E8
//4.7501184E8
//4.7501184E8
public strictfp class Chapter4 {
    /**
     *
     * @param args
     * @throws IOException
     * @throws URISyntaxException
     */
    public static void main(String[] args) throws IOException, URISyntaxException {
        for(int i=0;i<3;++i){
            out.println(i);
        }
    }
}
