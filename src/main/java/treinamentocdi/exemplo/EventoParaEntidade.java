package treinamentocdi.exemplo;

import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@Notificar
public class EventoParaEntidade implements TratarEntidade {
 
    @Inject
    private Event<Entidade> entidadeEvento;
 
    @Override
    public String trataEntidade(Entidade entidade) {
        entidadeEvento.fire(entidade);
        return "Disparou Evento";
    }
 
    public void eventoDisparado(@Observes Entidade entidade) {
        System.out.println("Observou evento disparado");
    }
}