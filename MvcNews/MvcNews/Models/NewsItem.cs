using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace MvcNews.Models
{
	public class NewsItem
	{
		[Key]
		public int Id { get; set; }
		
		[DataType(DataType.Date)]
		public DateTime TimeStamp { get; set; }

		[Required(ErrorMessage = "Text is required")]
		[StringLength(140, ErrorMessage = "Text must be between 5 and 140 characters", MinimumLength =5)]
		public string Text { get; set; }

		[Timestamp]
		public byte[] RowVersion;

	}
}
