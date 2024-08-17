import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FiltroColmenas {
    public static List<Colmena> filtrarColmenas(List<Colmena> colmenas, Predicate<Colmena> criterio) {
        return colmenas.stream().filter(criterio).collect(Collectors.toList());
    }
}

