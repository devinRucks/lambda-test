class TestFile {
    init {
        val tests = mutableListOf<Test>()
        for (i in (1..400)) {
            tests.add(Test(i.toString()))
        }
    }
}
