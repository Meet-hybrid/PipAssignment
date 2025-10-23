import unittest
from convert_to_uppercase import convert_to_uppercase

class TestConverToUppercase(unittest.TestCase):

	def test_for_sentence(self):
		result = convert_to_uppercase("I LOVE programming.")
		self.assertEqual(res ult, "I LOVE PROGRAMMING.")
	
	