#!/bin/bash

# Check if at least two arguments are provided
if [ "$#" -lt 2 ]; then
    echo "Usage: $0 <input1>"
    exit 1
fi

# Assign command-line arguments to variables
input1="$1"
input2="$2"

# Display the inputs
echo "Input 1: $input1"
echo "Input 2: $input2"
