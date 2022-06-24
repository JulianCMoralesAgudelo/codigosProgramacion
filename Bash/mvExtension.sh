#!/bin/bash
for f in *converted; do
   mv -- "$f" "${f%.converted}.java"
done
