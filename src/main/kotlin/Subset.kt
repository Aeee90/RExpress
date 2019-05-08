import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

fun subsetConstruction(
    Q: List<Int>, Sigma: List<Int>, delta: Map<Pair<Int, Int>, List<Int>>, I: List<Int>, F: List<Int>
){
    val Q_d = HashSet<Int>()
    val delta_d = HashMap<Pair<Int, Int>, Int>()
    val F_d = HashSet<Int>()

    val queue = ArrayDeque<List<Int>>()
    queue.add(I)

    val dfastaes = HashMap<List<Int>, Int>()
    dfastaes[I] = 0

    while(queue.isNotEmpty()){
        val dstate = queue.poll()
        if(dfastaes[dstate] != null){
            Q_d.add(dfastaes[dstate]!!)
            F_d.add(dfastaes[dstate]!!)
        }

        for(sigma in Sigma){
            val dnext = HashSet<List<Int>>()
            //for( q in dfastaes) if(delta.get(Pair<Int, Int>(q, sigma)) != null) dnext.add(delta[Pair(q, sigma)])
        }


    }
}