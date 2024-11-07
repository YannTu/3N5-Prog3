package org.typayachi.org.typayachi

//class type exception override message
class ElementNonTrouvéException: Exception() {
    override val message: String?
        get() = "L'élément n'a pas été trouvé dans le tableau"
}