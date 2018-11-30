package com.example.atferworks.pillsmanager;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
//@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {


    public interface Logger {
        public void log (String message);
    }

    public interface HtmlValidator {
        boolean isValid(String html);
    }

    public class BlogService {
        Logger logger;
        HtmlValidator htmlValidator;

        public BlogService(Logger logger, HtmlValidator htmlValidator){
            this.logger = logger;
            this.htmlValidator = htmlValidator;
        }

        private void Log(String message){
            if (logger != null)
                logger.log(message);
        }

        public boolean publishPost(String html){
            if (htmlValidator.isValid(html))
            {
                Log("Usuario Aceptado");

                return true;
            }
            else
            {
                Log("Este Usuario no existe");

                throw new IllegalArgumentException("Error en la autenticacion");
            }
        }
    }
}

