#!/usr/bin/env bash

(runnrex git_stages 2>&1 | bat)
echo "RC=$?"

