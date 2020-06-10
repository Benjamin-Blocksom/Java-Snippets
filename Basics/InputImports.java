// Add imports (A) or (B) by commenting back in. 
// Imports (C), (D), and (E) do not work.

// (A)
// import java.nio.file.*

// (B)
import java.nio.file.Files;
import java.nio.file.Paths;

// (C)
// import java.nio.*; <-- Nope. Must match a class name, not a file name.

// (D)
// import java.nio.*.*; <-- Nope. Cannot have two wildcards.

// (E)
// import java.nio.files.Paths.*; <-- Nope. Class names, not methods.

public class InputImports {
	public void read(Files files) {
	Paths.get("name");
	}	
}
 
