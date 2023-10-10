package polynomial
class Polynomial(private val terms: List<Pair<Double, Int>>) {

    fun degree(): Int = terms.maxByOrNull { it.second }?.second ?: 0

    operator fun plus(other: Polynomial): Polynomial {
        val resultTerms = this.terms.toMutableList()
        for ((coeff, degree) in other.terms) {
            val index = resultTerms.indexOfFirst { it.second == degree }
            if (index != -1) {
                resultTerms[index] = resultTerms[index].first + coeff to degree
            } else {
                resultTerms.add(coeff to degree)
            }
        }
        return Polynomial(resultTerms)
    }

    operator fun times(other: Polynomial): Polynomial {
        val resultTerms = mutableListOf<Pair<Double, Int>>()
        for ((thisCoeff, thisDegree) in this.terms) {
            for ((otherCoeff, otherDegree) in other.terms) {
                val newCoeff = thisCoeff * otherCoeff
                val newDegree = thisDegree + otherDegree
                val index = resultTerms.indexOfFirst { it.second == newDegree }
                if (index != -1) {
                    resultTerms[index] = resultTerms[index].first + newCoeff to newDegree
                } else {
                    resultTerms.add(newCoeff to newDegree)
                }
            }
        }
        return Polynomial(resultTerms)
    }

    override fun toString(): String {
        return terms.joinToString(" + ") { (coeff, degree) -> "${coeff}x^$degree" }
    }
}