times <- read.csv("../data/elapsedTimeStats.csv", header = TRUE)
names(times) <- c("Elapsed_ms")

if (!dir.exists("../data")) dir.create("../data")

png("../data/chart.png")

barplot(times$Elapsed_ms,
        main = "Elapsed Times from Java Program", # title
        ylab = "Milliseconds", # label y-axis
        xlab = "Run Index", # label x-axis
        col = "steelblue") # set the fill color of the bars
dev.off()