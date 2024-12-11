import com.amazonaws.services.lambda.runtime.RequestHandler
import com.amazonaws.services.lambda.runtime.Context


class LambdaEntry : RequestHandler<Map<String, Any>, String> {

    override fun handleRequest(input: Map<String, Any>, context: Context): String {
        context.logger.log("Input received: $input")
        return "Hello, ${input["name"] ?: "World"}!"
    }
}
