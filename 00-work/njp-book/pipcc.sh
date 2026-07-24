#!/usr/bin/env bash

opts="-keepasjava -java -format -comments -utf8 -crossref -replace"

pipc "$opts" "$@"

