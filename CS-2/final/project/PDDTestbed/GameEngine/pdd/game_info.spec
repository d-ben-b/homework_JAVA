# Specification  for updating elements in Game Status Repository according to packet

# initialize game status from game setting
[from_game_setting]
	[[initialize]]
		isStrategySpecific = N
		[[[updatingList]]]
			[[[[1]]]]
				operation = 'assign'
				gameElem = people
				updatingElem = {}
# update game status from packet
[from_packet]
	# map
	[[map]]
	    isStrategySpecific = N
	    [[[updatingList]]]
	        [[[[1]]]]
	            operation = 'assign'
	            gameElem = land.width
	            updatingElem = $width
	        [[[[2]]]]
	            operation = 'assign'
	            gameElem = land.length
	            updatingElem = $length
[mapping]
	score = castle.score
