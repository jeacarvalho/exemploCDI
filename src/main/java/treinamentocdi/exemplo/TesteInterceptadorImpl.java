package treinamentocdi.exemplo;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
 
public @Interceptor
@TesteInterceptador
class TesteInterceptadorImpl {
 
    @AroundInvoke
    public Object interceptar(InvocationContext invocationContext)
            throws Exception {
 
        StringBuffer sb = new StringBuffer();
        sb.append("Interceptando no método: ");
        sb.append(invocationContext.getMethod().getName());
        sb.append(" da classe ");
        sb.append(invocationContext.getMethod().getDeclaringClass().getName());
 
        System.out.println(sb.toString());
 
        return invocationContext.proceed();
 
    }
} 
