package javamop.output;

import javamop.parser.ast.MOPSpecFile;

/**
 * A package declaration string.
 */
public class Package {
    private final String packageString;
    
    /**
     * Retrieve the package from a specification file.
     * @param mopSpecFile The specification to retrieve the package from.
     */
    public Package(MOPSpecFile mopSpecFile) {
        if (mopSpecFile.getPakage() != null) {
            packageString = mopSpecFile.getPakage().toString().trim();
        } else {
            packageString = "";
        }
    }
    
    /**
     * The package declaration.
     * @return The package declaration string.
     */
    @Override
    public String toString(){
        return packageString;
    }
    
}
