// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc
import com.strumenta.kotlinmultiplatform.Arrays
import org.antlr.v4.runtime.misc.Utils
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.LexerATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.DFA

class FlatBuffersLexer(val input: CharStream) : Lexer(input) {
	// TODO Verify the runtime version is correct

    override val ruleNames: Array<String>?
        get() = Rules.values().map { it.name }.toTypedArray()

    override val grammarFileName: String
        get() = "FlatBuffers.g4"

    override val atn: ATN
		get() = FlatBuffersLexer.Companion.ATN

	companion object {
		val decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES = Arrays.asList<String?>(null, "'include'", 
		                                                   "';'", "'namespace'", 
		                                                   "'.'", "'attribute'", 
		                                                   "'table'", "'struct'", 
		                                                   "'{'", "'}'", "'enum'", 
		                                                   "':'", "'union'", "'root_type'", 
		                                                   "'='", "'rpc_service'", 
		                                                   "'('", "')'", "'['", 
		                                                   "']'", "','", "'file_extension'", 
		                                                   "'file_identifier'")
		private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, "STRING_CONSTANT", 
		                                                    "BASE_TYPE_NAME", 
		                                                    "IDENT", "INTEGER_CONSTANT", 
		                                                    "FLOAT_CONSTANT", 
		                                                    "COMMENT", "WHITESPACE")

		val VOCABULARY = VocabularyImpl(LITERAL_NAMES.toTypedArray(), SYMBOLIC_NAMES.toTypedArray())

        val tokenNames: Array<String?> = Array<String?>(SYMBOLIC_NAMES.size) {
            var el = VOCABULARY.getLiteralName(it)
            if (el == null) {
                el = VOCABULARY.getSymbolicName(it)
            }

            if (el == null) {
                el = "<INVALID>"
            }
            el
        }

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u001f\u017a\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0007\u0018\u00bf\u000a\u0018\u000c\u0018\u000e\u0018\u00c2\u000b\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0005\u0019\u0137\u000a\u0019\u0003\u001a\u0003\u001a\u0007\u001a\u013b\u000a\u001a\u000c\u001a\u000e\u001a\u013e\u000b\u001a\u0003\u001b\u0005\u001b\u0141\u000a\u001b\u0003\u001b\u0006\u001b\u0144\u000a\u001b\u000d\u001b\u000e\u001b\u0145\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0005\u001b\u0151\u000a\u001b\u0003\u001c\u0005\u001c\u0154\u000a\u001c\u0003\u001c\u0006\u001c\u0157\u000a\u001c\u000d\u001c\u000e\u001c\u0158\u0003\u001c\u0003\u001c\u0006\u001c\u015d\u000a\u001c\u000d\u001c\u000e\u001c\u015e\u0003\u001c\u0003\u001c\u0005\u001c\u0163\u000a\u001c\u0003\u001c\u0006\u001c\u0166\u000a\u001c\u000d\u001c\u000e\u001c\u0167\u0005\u001c\u016a\u000a\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0007\u001d\u0170\u000a\u001d\u000c\u001d\u000e\u001d\u0173\u000b\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0002\u0002\u001f\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0007\u000d\u0008\u000f\u0009\u0011\u000a\u0013\u000b\u0015\u000c\u0017\u000d\u0019\u000e\u001b\u000f\u001d\u0010\u001f\u0011\u0021\u0012\u0023\u0013\u0025\u0014\u0027\u0015\u0029\u0016\u002b\u0017\u002d\u0018\u002f\u0019\u0031\u001a\u0033\u001b\u0035\u001c\u0037\u001d\u0039\u001e\u003b\u001f\u0003\u0002\u000a\u0005\u0002\u000c\u000c\u000f\u000f\u0024\u0024\u0005\u0002\u0043\u005c\u0061\u0061\u0063\u007c\u0006\u0002\u0032\u003b\u0043\u005c\u0061\u0061\u0063\u007c\u0003\u0002\u0032\u003b\u0004\u0002\u0047\u0047\u0067\u0067\u0004\u0002\u002d\u002d\u002f\u002f\u0004\u0002\u000c\u000c\u000f\u000f\u0005\u0002\u000b\u000c\u000f\u000f\u0022\u0022\u0002\u019b\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\u000d\u0003\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002\u0002\u0002\u0011\u0003\u0002\u0002\u0002\u0002\u0013\u0003\u0002\u0002\u0002\u0002\u0015\u0003\u0002\u0002\u0002\u0002\u0017\u0003\u0002\u0002\u0002\u0002\u0019\u0003\u0002\u0002\u0002\u0002\u001b\u0003\u0002\u0002\u0002\u0002\u001d\u0003\u0002\u0002\u0002\u0002\u001f\u0003\u0002\u0002\u0002\u0002\u0021\u0003\u0002\u0002\u0002\u0002\u0023\u0003\u0002\u0002\u0002\u0002\u0025\u0003\u0002\u0002\u0002\u0002\u0027\u0003\u0002\u0002\u0002\u0002\u0029\u0003\u0002\u0002\u0002\u0002\u002b\u0003\u0002\u0002\u0002\u0002\u002d\u0003\u0002\u0002\u0002\u0002\u002f\u0003\u0002\u0002\u0002\u0002\u0031\u0003\u0002\u0002\u0002\u0002\u0033\u0003\u0002\u0002\u0002\u0002\u0035\u0003\u0002\u0002\u0002\u0002\u0037\u0003\u0002\u0002\u0002\u0002\u0039\u0003\u0002\u0002\u0002\u0002\u003b\u0003\u0002\u0002\u0002\u0003\u003d\u0003\u0002\u0002\u0002\u0005\u0045\u0003\u0002\u0002\u0002\u0007\u0047\u0003\u0002\u0002\u0002\u0009\u0051\u0003\u0002\u0002\u0002\u000b\u0053\u0003\u0002\u0002\u0002\u000d\u005d\u0003\u0002\u0002\u0002\u000f\u0063\u0003\u0002\u0002\u0002\u0011\u006a\u0003\u0002\u0002\u0002\u0013\u006c\u0003\u0002\u0002\u0002\u0015\u006e\u0003\u0002\u0002\u0002\u0017\u0073\u0003\u0002\u0002\u0002\u0019\u0075\u0003\u0002\u0002\u0002\u001b\u007b\u0003\u0002\u0002\u0002\u001d\u0085\u0003\u0002\u0002\u0002\u001f\u0087\u0003\u0002\u0002\u0002\u0021\u0093\u0003\u0002\u0002\u0002\u0023\u0095\u0003\u0002\u0002\u0002\u0025\u0097\u0003\u0002\u0002\u0002\u0027\u0099\u0003\u0002\u0002\u0002\u0029\u009b\u0003\u0002\u0002\u0002\u002b\u009d\u0003\u0002\u0002\u0002\u002d\u00ac\u0003\u0002\u0002\u0002\u002f\u00bc\u0003\u0002\u0002\u0002\u0031\u0136\u0003\u0002\u0002\u0002\u0033\u0138\u0003\u0002\u0002\u0002\u0035\u0150\u0003\u0002\u0002\u0002\u0037\u0153\u0003\u0002\u0002\u0002\u0039\u016b\u0003\u0002\u0002\u0002\u003b\u0176\u0003\u0002\u0002\u0002\u003d\u003e\u0007\u006b\u0002\u0002\u003e\u003f\u0007\u0070\u0002\u0002\u003f\u0040\u0007\u0065\u0002\u0002\u0040\u0041\u0007\u006e\u0002\u0002\u0041\u0042\u0007\u0077\u0002\u0002\u0042\u0043\u0007\u0066\u0002\u0002\u0043\u0044\u0007\u0067\u0002\u0002\u0044\u0004\u0003\u0002\u0002\u0002\u0045\u0046\u0007\u003d\u0002\u0002\u0046\u0006\u0003\u0002\u0002\u0002\u0047\u0048\u0007\u0070\u0002\u0002\u0048\u0049\u0007\u0063\u0002\u0002\u0049\u004a\u0007\u006f\u0002\u0002\u004a\u004b\u0007\u0067\u0002\u0002\u004b\u004c\u0007\u0075\u0002\u0002\u004c\u004d\u0007\u0072\u0002\u0002\u004d\u004e\u0007\u0063\u0002\u0002\u004e\u004f\u0007\u0065\u0002\u0002\u004f\u0050\u0007\u0067\u0002\u0002\u0050\u0008\u0003\u0002\u0002\u0002\u0051\u0052\u0007\u0030\u0002\u0002\u0052\u000a\u0003\u0002\u0002\u0002\u0053\u0054\u0007\u0063\u0002\u0002\u0054\u0055\u0007\u0076\u0002\u0002\u0055\u0056\u0007\u0076\u0002\u0002\u0056\u0057\u0007\u0074\u0002\u0002\u0057\u0058\u0007\u006b\u0002\u0002\u0058\u0059\u0007\u0064\u0002\u0002\u0059\u005a\u0007\u0077\u0002\u0002\u005a\u005b\u0007\u0076\u0002\u0002\u005b\u005c\u0007\u0067\u0002\u0002\u005c\u000c\u0003\u0002\u0002\u0002\u005d\u005e\u0007\u0076\u0002\u0002\u005e\u005f\u0007\u0063\u0002\u0002\u005f\u0060\u0007\u0064\u0002\u0002\u0060\u0061\u0007\u006e\u0002\u0002\u0061\u0062\u0007\u0067\u0002\u0002\u0062\u000e\u0003\u0002\u0002\u0002\u0063\u0064\u0007\u0075\u0002\u0002\u0064\u0065\u0007\u0076\u0002\u0002\u0065\u0066\u0007\u0074\u0002\u0002\u0066\u0067\u0007\u0077\u0002\u0002\u0067\u0068\u0007\u0065\u0002\u0002\u0068\u0069\u0007\u0076\u0002\u0002\u0069\u0010\u0003\u0002\u0002\u0002\u006a\u006b\u0007\u007d\u0002\u0002\u006b\u0012\u0003\u0002\u0002\u0002\u006c\u006d\u0007\u007f\u0002\u0002\u006d\u0014\u0003\u0002\u0002\u0002\u006e\u006f\u0007\u0067\u0002\u0002\u006f\u0070\u0007\u0070\u0002\u0002\u0070\u0071\u0007\u0077\u0002\u0002\u0071\u0072\u0007\u006f\u0002\u0002\u0072\u0016\u0003\u0002\u0002\u0002\u0073\u0074\u0007\u003c\u0002\u0002\u0074\u0018\u0003\u0002\u0002\u0002\u0075\u0076\u0007\u0077\u0002\u0002\u0076\u0077\u0007\u0070\u0002\u0002\u0077\u0078\u0007\u006b\u0002\u0002\u0078\u0079\u0007\u0071\u0002\u0002\u0079\u007a\u0007\u0070\u0002\u0002\u007a\u001a\u0003\u0002\u0002\u0002\u007b\u007c\u0007\u0074\u0002\u0002\u007c\u007d\u0007\u0071\u0002\u0002\u007d\u007e\u0007\u0071\u0002\u0002\u007e\u007f\u0007\u0076\u0002\u0002\u007f\u0080\u0007\u0061\u0002\u0002\u0080\u0081\u0007\u0076\u0002\u0002\u0081\u0082\u0007\u007b\u0002\u0002\u0082\u0083\u0007\u0072\u0002\u0002\u0083\u0084\u0007\u0067\u0002\u0002\u0084\u001c\u0003\u0002\u0002\u0002\u0085\u0086\u0007\u003f\u0002\u0002\u0086\u001e\u0003\u0002\u0002\u0002\u0087\u0088\u0007\u0074\u0002\u0002\u0088\u0089\u0007\u0072\u0002\u0002\u0089\u008a\u0007\u0065\u0002\u0002\u008a\u008b\u0007\u0061\u0002\u0002\u008b\u008c\u0007\u0075\u0002\u0002\u008c\u008d\u0007\u0067\u0002\u0002\u008d\u008e\u0007\u0074\u0002\u0002\u008e\u008f\u0007\u0078\u0002\u0002\u008f\u0090\u0007\u006b\u0002\u0002\u0090\u0091\u0007\u0065\u0002\u0002\u0091\u0092\u0007\u0067\u0002\u0002\u0092\u0020\u0003\u0002\u0002\u0002\u0093\u0094\u0007\u002a\u0002\u0002\u0094\u0022\u0003\u0002\u0002\u0002\u0095\u0096\u0007\u002b\u0002\u0002\u0096\u0024\u0003\u0002\u0002\u0002\u0097\u0098\u0007\u005d\u0002\u0002\u0098\u0026\u0003\u0002\u0002\u0002\u0099\u009a\u0007\u005f\u0002\u0002\u009a\u0028\u0003\u0002\u0002\u0002\u009b\u009c\u0007\u002e\u0002\u0002\u009c\u002a\u0003\u0002\u0002\u0002\u009d\u009e\u0007\u0068\u0002\u0002\u009e\u009f\u0007\u006b\u0002\u0002\u009f\u00a0\u0007\u006e\u0002\u0002\u00a0\u00a1\u0007\u0067\u0002\u0002\u00a1\u00a2\u0007\u0061\u0002\u0002\u00a2\u00a3\u0007\u0067\u0002\u0002\u00a3\u00a4\u0007\u007a\u0002\u0002\u00a4\u00a5\u0007\u0076\u0002\u0002\u00a5\u00a6\u0007\u0067\u0002\u0002\u00a6\u00a7\u0007\u0070\u0002\u0002\u00a7\u00a8\u0007\u0075\u0002\u0002\u00a8\u00a9\u0007\u006b\u0002\u0002\u00a9\u00aa\u0007\u0071\u0002\u0002\u00aa\u00ab\u0007\u0070\u0002\u0002\u00ab\u002c\u0003\u0002\u0002\u0002\u00ac\u00ad\u0007\u0068\u0002\u0002\u00ad\u00ae\u0007\u006b\u0002\u0002\u00ae\u00af\u0007\u006e\u0002\u0002\u00af\u00b0\u0007\u0067\u0002\u0002\u00b0\u00b1\u0007\u0061\u0002\u0002\u00b1\u00b2\u0007\u006b\u0002\u0002\u00b2\u00b3\u0007\u0066\u0002\u0002\u00b3\u00b4\u0007\u0067\u0002\u0002\u00b4\u00b5\u0007\u0070\u0002\u0002\u00b5\u00b6\u0007\u0076\u0002\u0002\u00b6\u00b7\u0007\u006b\u0002\u0002\u00b7\u00b8\u0007\u0068\u0002\u0002\u00b8\u00b9\u0007\u006b\u0002\u0002\u00b9\u00ba\u0007\u0067\u0002\u0002\u00ba\u00bb\u0007\u0074\u0002\u0002\u00bb\u002e\u0003\u0002\u0002\u0002\u00bc\u00c0\u0007\u0024\u0002\u0002\u00bd\u00bf\u000a\u0002\u0002\u0002\u00be\u00bd\u0003\u0002\u0002\u0002\u00bf\u00c2\u0003\u0002\u0002\u0002\u00c0\u00be\u0003\u0002\u0002\u0002\u00c0\u00c1\u0003\u0002\u0002\u0002\u00c1\u00c3\u0003\u0002\u0002\u0002\u00c2\u00c0\u0003\u0002\u0002\u0002\u00c3\u00c4\u0007\u0024\u0002\u0002\u00c4\u0030\u0003\u0002\u0002\u0002\u00c5\u00c6\u0007\u0064\u0002\u0002\u00c6\u00c7\u0007\u0071\u0002\u0002\u00c7\u00c8\u0007\u0071\u0002\u0002\u00c8\u0137\u0007\u006e\u0002\u0002\u00c9\u00ca\u0007\u0064\u0002\u0002\u00ca\u00cb\u0007\u007b\u0002\u0002\u00cb\u00cc\u0007\u0076\u0002\u0002\u00cc\u0137\u0007\u0067\u0002\u0002\u00cd\u00ce\u0007\u0077\u0002\u0002\u00ce\u00cf\u0007\u0064\u0002\u0002\u00cf\u00d0\u0007\u007b\u0002\u0002\u00d0\u00d1\u0007\u0076\u0002\u0002\u00d1\u0137\u0007\u0067\u0002\u0002\u00d2\u00d3\u0007\u0075\u0002\u0002\u00d3\u00d4\u0007\u006a\u0002\u0002\u00d4\u00d5\u0007\u0071\u0002\u0002\u00d5\u00d6\u0007\u0074\u0002\u0002\u00d6\u0137\u0007\u0076\u0002\u0002\u00d7\u00d8\u0007\u0077\u0002\u0002\u00d8\u00d9\u0007\u0075\u0002\u0002\u00d9\u00da\u0007\u006a\u0002\u0002\u00da\u00db\u0007\u0071\u0002\u0002\u00db\u00dc\u0007\u0074\u0002\u0002\u00dc\u0137\u0007\u0076\u0002\u0002\u00dd\u00de\u0007\u006b\u0002\u0002\u00de\u00df\u0007\u0070\u0002\u0002\u00df\u0137\u0007\u0076\u0002\u0002\u00e0\u00e1\u0007\u0077\u0002\u0002\u00e1\u00e2\u0007\u006b\u0002\u0002\u00e2\u00e3\u0007\u0070\u0002\u0002\u00e3\u0137\u0007\u0076\u0002\u0002\u00e4\u00e5\u0007\u0068\u0002\u0002\u00e5\u00e6\u0007\u006e\u0002\u0002\u00e6\u00e7\u0007\u0071\u0002\u0002\u00e7\u00e8\u0007\u0063\u0002\u0002\u00e8\u0137\u0007\u0076\u0002\u0002\u00e9\u00ea\u0007\u006e\u0002\u0002\u00ea\u00eb\u0007\u0071\u0002\u0002\u00eb\u00ec\u0007\u0070\u0002\u0002\u00ec\u0137\u0007\u0069\u0002\u0002\u00ed\u00ee\u0007\u0077\u0002\u0002\u00ee\u00ef\u0007\u006e\u0002\u0002\u00ef\u00f0\u0007\u0071\u0002\u0002\u00f0\u00f1\u0007\u0070\u0002\u0002\u00f1\u0137\u0007\u0069\u0002\u0002\u00f2\u00f3\u0007\u0066\u0002\u0002\u00f3\u00f4\u0007\u0071\u0002\u0002\u00f4\u00f5\u0007\u0077\u0002\u0002\u00f5\u00f6\u0007\u0064\u0002\u0002\u00f6\u00f7\u0007\u006e\u0002\u0002\u00f7\u0137\u0007\u0067\u0002\u0002\u00f8\u00f9\u0007\u006b\u0002\u0002\u00f9\u00fa\u0007\u0070\u0002\u0002\u00fa\u00fb\u0007\u0076\u0002\u0002\u00fb\u0137\u0007\u003a\u0002\u0002\u00fc\u00fd\u0007\u0077\u0002\u0002\u00fd\u00fe\u0007\u006b\u0002\u0002\u00fe\u00ff\u0007\u0070\u0002\u0002\u00ff\u0100\u0007\u0076\u0002\u0002\u0100\u0137\u0007\u003a\u0002\u0002\u0101\u0102\u0007\u006b\u0002\u0002\u0102\u0103\u0007\u0070\u0002\u0002\u0103\u0104\u0007\u0076\u0002\u0002\u0104\u0105\u0007\u0033\u0002\u0002\u0105\u0137\u0007\u0038\u0002\u0002\u0106\u0107\u0007\u0077\u0002\u0002\u0107\u0108\u0007\u006b\u0002\u0002\u0108\u0109\u0007\u0070\u0002\u0002\u0109\u010a\u0007\u0076\u0002\u0002\u010a\u010b\u0007\u0033\u0002\u0002\u010b\u0137\u0007\u0038\u0002\u0002\u010c\u010d\u0007\u006b\u0002\u0002\u010d\u010e\u0007\u0070\u0002\u0002\u010e\u010f\u0007\u0076\u0002\u0002\u010f\u0110\u0007\u0035\u0002\u0002\u0110\u0137\u0007\u0034\u0002\u0002\u0111\u0112\u0007\u0077\u0002\u0002\u0112\u0113\u0007\u006b\u0002\u0002\u0113\u0114\u0007\u0070\u0002\u0002\u0114\u0115\u0007\u0076\u0002\u0002\u0115\u0116\u0007\u0035\u0002\u0002\u0116\u0137\u0007\u0034\u0002\u0002\u0117\u0118\u0007\u006b\u0002\u0002\u0118\u0119\u0007\u0070\u0002\u0002\u0119\u011a\u0007\u0076\u0002\u0002\u011a\u011b\u0007\u0038\u0002\u0002\u011b\u0137\u0007\u0036\u0002\u0002\u011c\u011d\u0007\u0077\u0002\u0002\u011d\u011e\u0007\u006b\u0002\u0002\u011e\u011f\u0007\u0070\u0002\u0002\u011f\u0120\u0007\u0076\u0002\u0002\u0120\u0121\u0007\u0038\u0002\u0002\u0121\u0137\u0007\u0036\u0002\u0002\u0122\u0123\u0007\u0068\u0002\u0002\u0123\u0124\u0007\u006e\u0002\u0002\u0124\u0125\u0007\u0071\u0002\u0002\u0125\u0126\u0007\u0063\u0002\u0002\u0126\u0127\u0007\u0076\u0002\u0002\u0127\u0128\u0007\u0035\u0002\u0002\u0128\u0137\u0007\u0034\u0002\u0002\u0129\u012a\u0007\u0068\u0002\u0002\u012a\u012b\u0007\u006e\u0002\u0002\u012b\u012c\u0007\u0071\u0002\u0002\u012c\u012d\u0007\u0063\u0002\u0002\u012d\u012e\u0007\u0076\u0002\u0002\u012e\u012f\u0007\u0038\u0002\u0002\u012f\u0137\u0007\u0036\u0002\u0002\u0130\u0131\u0007\u0075\u0002\u0002\u0131\u0132\u0007\u0076\u0002\u0002\u0132\u0133\u0007\u0074\u0002\u0002\u0133\u0134\u0007\u006b\u0002\u0002\u0134\u0135\u0007\u0070\u0002\u0002\u0135\u0137\u0007\u0069\u0002\u0002\u0136\u00c5\u0003\u0002\u0002\u0002\u0136\u00c9\u0003\u0002\u0002\u0002\u0136\u00cd\u0003\u0002\u0002\u0002\u0136\u00d2\u0003\u0002\u0002\u0002\u0136\u00d7\u0003\u0002\u0002\u0002\u0136\u00dd\u0003\u0002\u0002\u0002\u0136\u00e0\u0003\u0002\u0002\u0002\u0136\u00e4\u0003\u0002\u0002\u0002\u0136\u00e9\u0003\u0002\u0002\u0002\u0136\u00ed\u0003\u0002\u0002\u0002\u0136\u00f2\u0003\u0002\u0002\u0002\u0136\u00f8\u0003\u0002\u0002\u0002\u0136\u00fc\u0003\u0002\u0002\u0002\u0136\u0101\u0003\u0002\u0002\u0002\u0136\u0106\u0003\u0002\u0002\u0002\u0136\u010c\u0003\u0002\u0002\u0002\u0136\u0111\u0003\u0002\u0002\u0002\u0136\u0117\u0003\u0002\u0002\u0002\u0136\u011c\u0003\u0002\u0002\u0002\u0136\u0122\u0003\u0002\u0002\u0002\u0136\u0129\u0003\u0002\u0002\u0002\u0136\u0130\u0003\u0002\u0002\u0002\u0137\u0032\u0003\u0002\u0002\u0002\u0138\u013c\u0009\u0003\u0002\u0002\u0139\u013b\u0009\u0004\u0002\u0002\u013a\u0139\u0003\u0002\u0002\u0002\u013b\u013e\u0003\u0002\u0002\u0002\u013c\u013a\u0003\u0002\u0002\u0002\u013c\u013d\u0003\u0002\u0002\u0002\u013d\u0034\u0003\u0002\u0002\u0002\u013e\u013c\u0003\u0002\u0002\u0002\u013f\u0141\u0007\u002f\u0002\u0002\u0140\u013f\u0003\u0002\u0002\u0002\u0140\u0141\u0003\u0002\u0002\u0002\u0141\u0143\u0003\u0002\u0002\u0002\u0142\u0144\u0009\u0005\u0002\u0002\u0143\u0142\u0003\u0002\u0002\u0002\u0144\u0145\u0003\u0002\u0002\u0002\u0145\u0143\u0003\u0002\u0002\u0002\u0145\u0146\u0003\u0002\u0002\u0002\u0146\u0151\u0003\u0002\u0002\u0002\u0147\u0148\u0007\u0076\u0002\u0002\u0148\u0149\u0007\u0074\u0002\u0002\u0149\u014a\u0007\u0077\u0002\u0002\u014a\u0151\u0007\u0067\u0002\u0002\u014b\u014c\u0007\u0068\u0002\u0002\u014c\u014d\u0007\u0063\u0002\u0002\u014d\u014e\u0007\u006e\u0002\u0002\u014e\u014f\u0007\u0075\u0002\u0002\u014f\u0151\u0007\u0067\u0002\u0002\u0150\u0140\u0003\u0002\u0002\u0002\u0150\u0147\u0003\u0002\u0002\u0002\u0150\u014b\u0003\u0002\u0002\u0002\u0151\u0036\u0003\u0002\u0002\u0002\u0152\u0154\u0007\u002f\u0002\u0002\u0153\u0152\u0003\u0002\u0002\u0002\u0153\u0154\u0003\u0002\u0002\u0002\u0154\u0156\u0003\u0002\u0002\u0002\u0155\u0157\u0009\u0005\u0002\u0002\u0156\u0155\u0003\u0002\u0002\u0002\u0157\u0158\u0003\u0002\u0002\u0002\u0158\u0156\u0003\u0002\u0002\u0002\u0158\u0159\u0003\u0002\u0002\u0002\u0159\u015a\u0003\u0002\u0002\u0002\u015a\u015c\u0007\u0030\u0002\u0002\u015b\u015d\u0009\u0005\u0002\u0002\u015c\u015b\u0003\u0002\u0002\u0002\u015d\u015e\u0003\u0002\u0002\u0002\u015e\u015c\u0003\u0002\u0002\u0002\u015e\u015f\u0003\u0002\u0002\u0002\u015f\u0169\u0003\u0002\u0002\u0002\u0160\u0162\u0009\u0006\u0002\u0002\u0161\u0163\u0009\u0007\u0002\u0002\u0162\u0161\u0003\u0002\u0002\u0002\u0162\u0163\u0003\u0002\u0002\u0002\u0163\u0165\u0003\u0002\u0002\u0002\u0164\u0166\u0009\u0005\u0002\u0002\u0165\u0164\u0003\u0002\u0002\u0002\u0166\u0167\u0003\u0002\u0002\u0002\u0167\u0165\u0003\u0002\u0002\u0002\u0167\u0168\u0003\u0002\u0002\u0002\u0168\u016a\u0003\u0002\u0002\u0002\u0169\u0160\u0003\u0002\u0002\u0002\u0169\u016a\u0003\u0002\u0002\u0002\u016a\u0038\u0003\u0002\u0002\u0002\u016b\u016c\u0007\u0031\u0002\u0002\u016c\u016d\u0007\u0031\u0002\u0002\u016d\u0171\u0003\u0002\u0002\u0002\u016e\u0170\u000a\u0008\u0002\u0002\u016f\u016e\u0003\u0002\u0002\u0002\u0170\u0173\u0003\u0002\u0002\u0002\u0171\u016f\u0003\u0002\u0002\u0002\u0171\u0172\u0003\u0002\u0002\u0002\u0172\u0174\u0003\u0002\u0002\u0002\u0173\u0171\u0003\u0002\u0002\u0002\u0174\u0175\u0008\u001d\u0002\u0002\u0175\u003a\u0003\u0002\u0002\u0002\u0176\u0177\u0009\u0009\u0002\u0002\u0177\u0178\u0003\u0002\u0002\u0002\u0178\u0179\u0008\u001e\u0003\u0002\u0179\u003c\u0003\u0002\u0002\u0002\u0010\u0002\u00c0\u0136\u013c\u0140\u0145\u0150\u0153\u0158\u015e\u0162\u0167\u0169\u0171\u0004\u0002\u0003\u0002\u0008\u0002\u0002"

		val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
		init {
			decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
				DFA(ATN.getDecisionState(it)!!, it)
			})


		}
	}

    enum class Tokens(val id: Int) {
	    T__0(1),
	    T__1(2),
	    T__2(3),
	    T__3(4),
	    T__4(5),
	    T__5(6),
	    T__6(7),
	    T__7(8),
	    T__8(9),
	    T__9(10),
	    T__10(11),
	    T__11(12),
	    T__12(13),
	    T__13(14),
	    T__14(15),
	    T__15(16),
	    T__16(17),
	    T__17(18),
	    T__18(19),
	    T__19(20),
	    T__20(21),
	    T__21(22),
	    STRING_CONSTANT(23),
	    BASE_TYPE_NAME(24),
	    IDENT(25),
	    INTEGER_CONSTANT(26),
	    FLOAT_CONSTANT(27),
	    COMMENT(28),
	    WHITESPACE(29)
    }

	enum class Channels(val id: Int) {
		DEFAULT_TOKEN_CHANNEL(0),
		HIDDEN(1),
	}

	enum class Modes(val id: Int) {
		DEFAULT_MODE(0),
	}

	enum class Rules {
	    T__0,
	    T__1,
	    T__2,
	    T__3,
	    T__4,
	    T__5,
	    T__6,
	    T__7,
	    T__8,
	    T__9,
	    T__10,
	    T__11,
	    T__12,
	    T__13,
	    T__14,
	    T__15,
	    T__16,
	    T__17,
	    T__18,
	    T__19,
	    T__20,
	    T__21,
	    STRING_CONSTANT,
	    BASE_TYPE_NAME,
	    IDENT,
	    INTEGER_CONSTANT,
	    FLOAT_CONSTANT,
	    COMMENT,
	    WHITESPACE
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}