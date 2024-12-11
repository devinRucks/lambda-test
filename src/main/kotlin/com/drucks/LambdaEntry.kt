package com.drucks

import com.amazonaws.services.lambda.runtime.RequestHandler
import com.amazonaws.services.lambda.runtime.Context


class LambdaEntry : RequestHandler<Map<String, Any>, String> {
    val testFile = TestFile()

    init {
        println(this.javaClass.name)
    }

    override fun handleRequest(input: Map<String, Any>, context: Context): String {
        context.logger.log("Input received: $input")
        val tests = mutableListOf<Test>()
        for (i in (1..50)) {
            tests.add(Test(i.toString()))
        }
        println(tests)
        return "Hello, World!"
    }
}
