package authservice.authService.util.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class JwtUtils {

    private final static Logger logger = LoggerFactory.getLogger(JwtUtils.class);

    @Value("{aans.foood.secretKey}")
    private static String secretKey ;
    @Value("{aans.foood.expiration}")
    private static String expiration;



}
