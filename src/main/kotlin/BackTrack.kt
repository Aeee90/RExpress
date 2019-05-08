
import java.lang.Character.MIN_VALUE as NULL_CAHR

class BackTrack {

    private lateinit var regexp: String
    private lateinit var text: String

    fun match(regexp: String, text: String): Int{
        this.regexp = regexp
        this.text = text

        var ri = 0
        var rt = 0
        if(regexp[ri] == '^') return matchhere(ri+1, rt)

        do {
            if(matchhere(ri, rt) > 0) return 1
        }while(text[rt++] != NULL_CAHR)

        return 0
    }

    private fun matchhere(ri: Int, ti: Int): Int = when(true){
        regexp[ri] == NULL_CAHR -> 1
        regexp[ri + 1] == '*' -> matchstar(regexp[ri], ri + 2, ti)
        regexp[ri] == '$' && regexp[ri + 1] == NULL_CAHR -> if(text[ti] == NULL_CAHR) 1 else 0
        text[ti] != NULL_CAHR && (regexp[ri] == '.' || regexp[ri] == text[ti]) -> matchhere(ri + 1, ti + 1)
        else -> 0
    }

    private fun matchstar(c: Char, ri :Int, ti: Int): Int{
        var t = ti
        do {
            if(matchhere(ri, t) > 0) return 1
        }while(text[t] != NULL_CAHR && (text[t++] == c || c == '.'))

        return 0
    }
}

fun main() {

}