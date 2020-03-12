package blog.tech.salman.libx.model

class Member {

    // Member variable
    private var id: Int? = null
    private var roll: Int? = null
    private var name: String? = null
    private var gender: String? = null // Student, Teacher
    private var type: String? = null // Student, Teacher

    constructor(id: Int?, roll: Int?, name: String?, gender: String?, type: String?) {
        this.id = id
        this.roll = roll
        this.name = name
        this.gender = gender
        this.type = type
    }


}