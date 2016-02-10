/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package lexevs.lexperformance;

import java.io.IOException;

import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Extensions.Generic.SearchExtension.MatchAlgorithm;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class MyBenchmark {

	
    
    @Benchmark
	public void testLuceneCommonWord() throws LBException, IOException {
		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
		test.runExtensionSearch("blood", MatchAlgorithm.LUCENE);
	}
    
    @Benchmark
	public void testLuceneUncommondWord() throws LBException, IOException {
		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
		test.runExtensionSearch("mud", MatchAlgorithm.LUCENE);
	}
    
    @Benchmark
	public void testLuceneArticle() throws LBException, IOException {
		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
		test.runExtensionSearch("the", MatchAlgorithm.LUCENE);
	}
    
    @Benchmark
	public void testLuceneSingleChar() throws LBException, IOException {
		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
		test.runExtensionSearch("a", MatchAlgorithm.LUCENE);
	}
    
    @Benchmark
	public void testLucenePhraseWithCaps() throws LBException, IOException {
		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
		test.runExtensionSearch("Lung Cancer", MatchAlgorithm.LUCENE);
	}
    
    @Benchmark
	public void testLucenePhraseLowerCase() throws LBException, IOException {
		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
		test.runExtensionSearch("liver carcinoma", MatchAlgorithm.LUCENE);
	}
    
    @Benchmark
	public void testLuceneCodeExactThesarus() throws LBException, IOException {
		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
		test.runExtensionSearch("C1243", MatchAlgorithm.CODE_EXACT);
	}
    
    @Benchmark
	public void testLuceneCodeExactMeta() throws LBException, IOException {
		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
		test.runExtensionSearch("10024003", MatchAlgorithm.CODE_EXACT);
	}
    
    @Benchmark
	public void testLuceneCodeExactICD() throws LBException, IOException {
		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
		test.runExtensionSearch("8.61", MatchAlgorithm.CODE_EXACT);
	}
    
    @Benchmark
	public void testContainsCommonWord() throws LBException, IOException {
		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
		test.runExtensionSearch("blood", MatchAlgorithm.PRESENTATION_CONTAINS);
	}
    
    @Benchmark
	public void testContainsUncommonWord() throws LBException, IOException {
		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
		test.runExtensionSearch("mud", MatchAlgorithm.PRESENTATION_CONTAINS);
	}
    
    @Benchmark
	public void testContainsArticle() throws LBException, IOException {
		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
		test.runExtensionSearch("the", MatchAlgorithm.PRESENTATION_CONTAINS);
	}
    
    @Benchmark
	public void testContainsSingleChar() throws LBException, IOException {
		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
		test.runExtensionSearch("a", MatchAlgorithm.PRESENTATION_CONTAINS);
	}
    
    @Benchmark
	public void testContainsPhraseWithCaps() throws LBException, IOException {
		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
		test.runExtensionSearch("Lung Cancer", MatchAlgorithm.PRESENTATION_CONTAINS);
	}
    
    @Benchmark
	public void testContainsPhraseLowerCase() throws LBException, IOException {
		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
		test.runExtensionSearch("liver carcinoma", MatchAlgorithm.PRESENTATION_CONTAINS);
	}
    
    @Benchmark
 	public void testExactContainsCommonWord() throws LBException, IOException {
 		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
 		test.runExtensionSearch("blood", MatchAlgorithm.PRESENTATION_EXACT);
 	}
    
    @Benchmark
 	public void testExactContainsUncommonWord() throws LBException, IOException {
 		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
 		test.runExtensionSearch("mud", MatchAlgorithm.PRESENTATION_EXACT);
 	}
    
    @Benchmark
 	public void testExactContainsArticle() throws LBException, IOException {
 		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
 		test.runExtensionSearch("the", MatchAlgorithm.PRESENTATION_EXACT);
 	}
    
    @Benchmark
 	public void testExactContainsSingleChar() throws LBException, IOException {
 		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
 		test.runExtensionSearch("a", MatchAlgorithm.PRESENTATION_EXACT);
 	}
    
    @Benchmark
 	public void testExactContainsPhraseWithCaps() throws LBException, IOException {
 		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
 		test.runExtensionSearch("Lung Cancer", MatchAlgorithm.PRESENTATION_EXACT);
 	}
    
    @Benchmark
 	public void testExactContainsPhraseLowerCase() throws LBException, IOException {
 		LexEVSSearchExtensionTest test = new LexEVSSearchExtensionTest();
 		test.runExtensionSearch("liver carcinoma", MatchAlgorithm.PRESENTATION_EXACT);
 	}


    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(MyBenchmark.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
