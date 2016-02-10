package lexevs.lexperformance;

import java.io.IOException;

import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.LexGrid.LexBIG.Exceptions.LBResourceUnavailableException;
import org.LexGrid.LexBIG.Extensions.Generic.SearchExtension;
import org.LexGrid.LexBIG.Impl.LexBIGServiceImpl;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.LexBIG.LexBIGService.LexBIGServiceManager;
import org.LexGrid.LexBIG.Utility.Iterators.ResolvedConceptReferencesIterator;

public class LexEVSSearchExtensionTest {
	LexBIGService lbs;
	LexBIGServiceManager lbsm;
	SearchExtension search;

	public LexEVSSearchExtensionTest() throws LBException {
		lbs = LexBIGServiceImpl.defaultInstance();
		lbsm = lbs.getServiceManager(null);
		search = (SearchExtension) lbs.getGenericExtension("SearchExtension");
	}
	
	public void runExtensionSearch(String textMatch, 
			SearchExtension.MatchAlgorithm matchAlgorithm) throws LBParameterException, IOException, LBResourceUnavailableException{
		ResolvedConceptReferencesIterator itr = search.search(textMatch, matchAlgorithm);
		assert(itr.hasNext());
	}

}
