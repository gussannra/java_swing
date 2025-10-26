echo "Compiling Java..."
javac  -cp ./src ./src/button/Main.java

echo "Running Java.."
java -cp ./src ./src/button/Main.java

echo "Running R script to generate plot..."
Rscript ./analysis/analyze.r

echo "Opening PNG plot..."

cmd.exe /C start "" "$(wslpath -w ./data/chart.png)"

echo "Done!"

