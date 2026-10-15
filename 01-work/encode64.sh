#!/usr/bin/env bash

(runnrex OdePipe 2>&1 | bat)
echo "RC=$?"

