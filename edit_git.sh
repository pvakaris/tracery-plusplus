#!/bin/bash

# Recursively find all empty directories in the current directory
find . -type d -empty | while read dir; do
    # Create a new .gitkeep file in the empty directory
    touch "$dir/.gitkeep"
    echo "Added .gitkeep to directory: $dir"
done